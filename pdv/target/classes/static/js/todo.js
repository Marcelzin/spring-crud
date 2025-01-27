function deletarTarefa(id) {
    Swal.fire({
        title: 'Tem certeza?',
        text: "Você não poderá reverter esta ação!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sim, deletar!',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                url: `/api/todos/${id}`,
                type: 'DELETE',
                success: function () {
                    Swal.fire(
                        'Deletado!',
                        'A tarefa foi deletada com sucesso.',
                        'success'
                    ).then(() => {
                        window.location.reload();
                    });
                },
                error: function () {
                    Swal.fire(
                        'Erro!',
                        'Não foi possível deletar a tarefa.',
                        'error'
                    );
                }
            });
        }
    });
}

// Terminar função
function editarTarefa(id) {
    Swal.fire({
        title: 'Tem certeza?',
        text: "Você não poderá reverter esta ação!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sim, deletar!',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                url: `/api/todos/${id}`,
                type: 'PUT',
                success: function () {
                    Swal.fire(
                        'Deletado!',
                        'A tarefa foi deletada com sucesso.',
                        'success'
                    ).then(() => {
                        window.location.reload();
                    });
                },
                error: function () {
                    Swal.fire(
                        'Erro!',
                        'Não foi possível deletar a tarefa.',
                        'error'
                    );
                }
            });
        }
    });
}